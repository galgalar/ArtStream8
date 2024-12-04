
import java.util.ArrayList;


public class Artists extends Informations {
    
    public static ArrayList names = new ArrayList<>();
    public static ArrayList pass = new ArrayList<>();
    public static ArrayList<DashboardArtist> dashboardArtists = new ArrayList<>();
    private int index = 0;
    public static int noOfArtist = 0;
    public String typeOfArtist;
    
    public Artists(String username,String password)
    {
        super(username,password);
        this.typeOfArtist = typeOfArtist;
        
        try
        {           
            names.add(username);
            pass.add(password);
            
            DashboardArtist artist = new DashboardArtist(username);
            artist.setVisible(false);
            dashboardArtists.add(artist);
 
             System.out.println(names.get(noOfArtist));
             System.out.println(pass.get(noOfArtist));
             
            ++noOfArtist;
            
        }catch(Exception e)
        {
            System.out.print("sdfdsf");
        }
        
    }

    public Artists()
    {
        super("Unknown","LOL");
    }
        
    public boolean validateLogin(String name, String password) {

        for (int i = 0; i < names.size(); ++i) {
            if (name.equals(names.get(i)) && password.equals(pass.get(i))) {
                index = i;              
                return true; 
            }
        }
        return false; 
    }
    public boolean validateRegister(String name, String password) {

        for (int i = 0; i < names.size(); ++i) {
            if (name.equals(names.get(i)) && password.equals(pass.get(i))) {
                return true; 
            }
        }
        return false; 
    }

    public void  dashboardArtist()
    {       
        dashboardArtists.get(index).setVisible(true);; 
    }

    
    
    
    
}
