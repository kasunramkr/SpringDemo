package demo.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by   : Milinda
 * Email        : milinda@codegen.net
 * Date         : 3/20/2019
 * Time         : 4:13 PM
 */

@RestController
public class TopicController
{
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        List<Topic> topics = loadAllTopics();
        return topics;
    }

    private List<Topic> loadAllTopics()
    {
        List<Topic> topics = new ArrayList<>();
        topics.add( new Topic( 1, "JAVA", "java Description" ) );
        topics.add( new Topic( 2, "C++", "c++ Description" ) );
        topics.add( new Topic( 3, "Spring", "spring Description" ) );
        topics.add( new Topic( 4, "JAVASCRIPT", "javascript Description" ) );
        return topics;
    }
}
