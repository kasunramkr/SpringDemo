package demo.topic;

/**
 * Created by   : Milinda
 * Email        : milinda@codegen.net
 * Date         : 3/20/2019
 * Time         : 4:19 PM
 */
public class Topic
{
    private int id;
    private String name;
    private String disscription;

    public Topic( int id, String name, String description )
    {
        this.id = id;
        this.name = name;
        this.disscription = description;
    }

    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDisscription()
    {
        return disscription;
    }

    public void setDisscription( String disscription )
    {
        this.disscription = disscription;
    }
}
