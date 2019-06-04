package demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> topics = new ArrayList<>( Arrays.asList(
            new Topic( 1, "JAVA", "java Description" ),
            new Topic( 2, "C++", "c++ Description" ),
            new Topic( 3, "Spring", "spring Description" ),
            new Topic( 4, "JAVASCRIPT", "javascript Description" )
    ));

    public List<Topic> getAllTopics()
    {
        ArrayList<Topic> topics = new ArrayList<>(  );
        topicRepository.findAll().forEach( topic -> topics.add( topic ) );
        return topics;
    }

    public Topic getTopic( Integer id )
    {
        if( topicRepository.existsById( id ) )
        {
            return topicRepository.findById( id ).get();
        }
        else
        {
            return null;
        }
    }

    public void addTopic( Topic topic )
    {
        topicRepository.save( topic );
    }

    public void updateTopic( Topic topic )
    {
        if( topicRepository.existsById( topic.getId() ) )
        {
            Topic topicTemp = topicRepository.findById( topic.getId() ).get();
            topicTemp.setName( topic.getName() );
            topicTemp.setDescription( topic.getDescription() );
        }
    }

    public void deleteTopic( Integer id )
    {
        topicRepository.deleteById( id );
    }

    public void deleteAllTopics( )
    {
        topicRepository.deleteAll();
    }

}
