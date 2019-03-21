package demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @Autowired
    private TopicService topicservice;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return topicservice.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic ( @PathVariable int id )
    {
        return topicservice.getTopic( id );
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic( @RequestBody Topic topic )
    {
        topicservice.addTopic( topic );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics")
    public void updateTopic( @RequestBody Topic topic )
    {
        topicservice.updateTopic( topic );
    }
}
