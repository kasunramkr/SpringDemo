package demo.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by   : Milinda
 * Email        : milinda@codegen.net
 * Date         : 3/20/2019
 * Time         : 7:16 PM
 */

@Service
public class Topicservice
{
    public List<Topic> loadAllTopics()
    {
        List<Topic> topics = new ArrayList<>();
        topics.add( new Topic( 1, "JAVA", "java Description" ) );
        topics.add( new Topic( 2, "C++", "c++ Description" ) );
        topics.add( new Topic( 3, "Spring", "spring Description" ) );
        topics.add( new Topic( 4, "JAVASCRIPT", "javascript Description" ) );
        return topics;
    }
}
