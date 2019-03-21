package demo.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by   : Milinda
 * Email        : milinda@codegen.net
 * Date         : 3/20/2019
 * Time         : 7:16 PM
 */

@Service
public class TopicService
{
    public List<Topic> topics = new ArrayList<>( Arrays.asList(
            new Topic( 1, "JAVA", "java Description" ),
            new Topic( 2, "C++", "c++ Description" ),
            new Topic( 3, "Spring", "spring Description" ),
            new Topic( 4, "JAVASCRIPT", "javascript Description" )
    ));

    public List<Topic> getAllTopics()
    {
        return topics;
    }

    public Topic getTopic( int id )
    {
        if( topics.stream().anyMatch( t -> t.getId() == id ) )
        {
            return topics.stream().filter( t -> t.getId() == id ).findFirst().get();
        }
        else
        {
            return null;
        }
    }

    public void addTopic( Topic topic )
    {
        if( !topics.stream().anyMatch( t -> t.getId() == topic.getId() ) )
        {
            topics.add( topic );
        }
    }

    public void updateTopic( Topic topic )
    {
        if( topics.stream().anyMatch( t -> t.getId() == topic.getId() ) )
        {
            Topic topic1 = topics.stream().filter( t -> t.getId() == topic.getId() ).findFirst().get();
            topic1.setName( topic.getName() );
            topic1.setDescription( topic.getDescription() );
        }
    }

}
