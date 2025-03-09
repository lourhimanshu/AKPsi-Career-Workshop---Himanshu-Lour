// Sports class
class Sports {
    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in " + getName());
    }
}

// Soccer class inherits from Sports and overrides methods
class Soccer extends Sports {
    
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Override getNumberOfTeamMembers to print the specific number of players for Soccer
    @Override
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Solution {
    public static void main(String[] args) {
        // Creating an object of Sports
        Sports sport = new Sports();
        System.out.println(sport.getName());  // Output for Sports class
        sport.getNumberOfTeamMembers();      // Output for Sports class

        // Creating an object of Soccer (which inherits from Sports)
        Soccer soccer = new Soccer();
        System.out.println(soccer.getName());  // Output for Soccer class
        soccer.getNumberOfTeamMembers();      // Output for Soccer class
    }
}