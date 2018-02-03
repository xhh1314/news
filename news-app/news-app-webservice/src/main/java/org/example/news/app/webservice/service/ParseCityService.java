package org.example.news.app.webservice.service;

import org.example.news.app.common.entity.AppCity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseCityService {

    private static final Logger log = LoggerFactory.getLogger("ParseCityService");

    private final Node root = new Node();
    /**
     * 编码的长度
     */
    private final int encodingLength;
    private final int totalLength;

    private final List<AppCity> cities;

    private String zeroPattern = "[1-9]+";

    public ParseCityService(List<AppCity> cities, int encodingLength, int totalLength) {
        this.cities = cities;
        this.encodingLength = encodingLength;
        this.totalLength = totalLength;
    }

    private final Pattern pattern = Pattern.compile(zeroPattern);

    private final List<AppCity> failNode = new LinkedList<>();

    public void initial() {
        doInitial(this.cities);
    }

    private void doInitial(List<AppCity> cities) {
        if (this.totalLength % encodingLength != 0) {
            throw new IllegalArgumentException("不合法的编码格式!");
        }
        int num = totalLength / encodingLength;
        StringBuilder zeroCode = new StringBuilder();
        for (int i = 0; i < totalLength; i++) {
            zeroCode.append("0");
        }
        //得到全部是0的字符串
        String zeroString = zeroCode.toString();
        for (AppCity city : cities) {
            String code = city.getCityId().toString();
            //先判断下是否是根,即code=00000000的情况
            if (!pattern.matcher(code).find()) {
                this.root.name = city.getName();
                this.root.id = city.getCityId();
                continue;
            }
            int count = 1;
            while (count <= num) {
                String subCode = code.substring(count * encodingLength);
                Matcher matcher = pattern.matcher(subCode);
                if (!matcher.find()) {
                    if (count == 1) {
                        newNode(city, root);
                    } else {
                        String parentCode = code.substring(0, (count - 1) * encodingLength) + zeroString.substring((count - 1) * encodingLength);
                        Node parent = findNodeById(Integer.parseInt(parentCode));
                        if (parent == null) {
                            log.info("节点{}暂未找到父节点!", code);
                            if (!cities.contains(new Node(Integer.parseInt(parentCode), null))) {
                                throw new IllegalArgumentException("父节点不存在!");
                            }
                            failNode.add(city);
                            break;
                        }
                        newNode(city, parent);
                    }
                    break;
                }
                count++;

            }


        }

        //如果有因为插入时父节点不存在的节点，则加入失败节点，然后重新再添加一次，主要是为了解决,错误的顺序导致的插入父节点失败问题！
        if (!failNode.isEmpty()) {
            doInitial(failNode);
        }


    }

    /**
     * 新增一个节点，更新node的next 和 parent属性
     *
     * @param city
     * @param parent
     * @return
     */
    private Node newNode(AppCity city, Node parent) {
        Node newNode = new Node(city.getCityId(), city.getName());
        newNode.parent = parent.id;
        if (parent.first == null) {
            parent.first = newNode;
        } else {
            Node next = parent.first;
            while (next.next != null) {
                next = next.next;
            }
            next.next = newNode;
        }
        return newNode;
    }

    /**
     * 广度优先遍历
     *
     * @param id
     * @return
     */
    public Node findNodeById(Integer id) {
        String code = id.toString();
        if (id == null || code.length() != totalLength)
            throw new IllegalArgumentException("不合法的id");
        Node next = this.root;
        //Stack<Node> stack = new Stack<>();
        Queue<Node> queue = new ArrayDeque<>(500);
        while (next != null || !queue.isEmpty()) {
            if (next == null)
                next = queue.poll();
            if (next.id == id)
                return next;
            if (next.first != null)
                queue.add(next.first);
            next = next.next;
        }

        return null;
    }


    private static class Node {
        private Integer id;
        private String name;
        private Integer parent;
        private Node next;
        private Node first;
        /**
         * 是否是叶子节点
         */
        private boolean leaf;

        Node() {
        }

        Node(Integer id, String name) {
            this.name = name;
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            return id.equals(node.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }


}


