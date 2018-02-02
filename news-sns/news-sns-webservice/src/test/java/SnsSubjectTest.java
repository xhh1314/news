import org.example.news.SnsWebServiceApplication;
import org.example.news.sns.common.dao.SnsSubjectDao;
import org.example.news.sns.common.entity.SnsSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SnsWebServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class SnsSubjectTest {
    @Autowired
    private SnsSubjectDao subjectDao;

    @Test
    public void test1() {

        SnsSubject snsSubject=new SnsSubject();
        snsSubject.setSubjectId(111111111111L);
        snsSubject.setForumId(11111111333L);
        snsSubject.setContent("我终于找到了你！");
        snsSubject.setUserId(1L);
        snsSubject.setForumId(1L);

        subjectDao.saveSubject(snsSubject);

    }
}
