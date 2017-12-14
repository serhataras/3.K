package src;

/**
 * Created by eliztekcan on 27.10.2017.
 */
public class GameEnvironment
{
    private Outdoor[] outdoors;
    private House house;

    public static final int OUTDOOR_NUMBER = 4;

    public GameEnvironment()
    {
        outdoors     = new Outdoor[OUTDOOR_NUMBER];
        house       = new House();
    }


    public GameEnvironment(Outdoor[] outdoor, House house)
    {
        this.house      = house;
        this.outdoors    = outdoor;
    }



    public Outdoor getOutdoorEnvironment(OptionType environment)
    {
        if (environment != OptionType.HOUSE_OPTION)
            return outdoors[environment.ordinal()];
        else
            return null;//Creates bugs
    }

    public void setOutdoor(Outdoor[] outdoor)
    {
        this.outdoors = outdoor;
    }

    public House getHouse()
    {
        return house;
    }

    public void setHouse(House house)
    {
        this.house = house;
    }
}