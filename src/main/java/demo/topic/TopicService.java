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
public class TopicService
{
    private List<Topic> loadAllTopics()
    {
        List<Topic> topics = new ArrayList<>();
        topics.add( new Topic( 1, "JAVA", "java Description" ) );
        topics.add( new Topic( 2, "C++", "c++ Description" ) );
        topics.add( new Topic( 3, "Spring", "spring Description" ) );
        topics.add( new Topic( 4, "JAVASCRIPT", "javascript Description" ) );
        return topics;
    }

    public List<Topic> getAllTopics()
    {
        return loadAllTopics();
    }

    public Topic getTopic( String id )
    {
        int idValue;
        Topic topic = null;
        try
        {
            idValue = Integer.parseInt( id );
            if( loadAllTopics().stream().anyMatch( t -> t.getId() == idValue ) )
            {
                topic = loadAllTopics().stream().filter( t -> t.getId() == idValue ).findFirst().get();
                return topic;
            }
            else
            {
                return topic;
            }
        }
        catch( NumberFormatException e )
        {
            e.printStackTrace();
        }
        return topic;
    }

}
