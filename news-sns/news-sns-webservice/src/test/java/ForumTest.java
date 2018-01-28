import org.example.news.SnsWebServiceApplication;
import org.example.news.base.module.cas.CasAutoConfig;
import org.example.news.base.util.time.TimeTransferUtil;
import org.example.news.sns.common.dao.SnsForumDao;
import org.example.news.sns.common.entity.SnsForum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SnsWebServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class ForumTest {

    @Autowired
    private SnsForumDao snsForumDao;

    @Autowired
    private CasAutoConfig casAutoConfig;
    @Test
    public void Test1() {
        SnsForum forum = new SnsForum();
        forum.setForumId(22222223L);
        forum.setName("新鲜事");
        forum.setDescrible("用户发的状态");
        forum.setSiteId(1);
        forum.setStatus(new Short("1"));
        forum.setCreateTime(TimeTransferUtil.getCurrentTimestamp());
        snsForumDao.saveForum(forum);
    }

    @Test
    public void test2(){

        System.out.println("测试注入属性是否成功!"+casAutoConfig.getCasServerLoginUrl());
    }


}
