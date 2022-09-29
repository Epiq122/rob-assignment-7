public class CustomArrayListApplication {

    public static void main(String[] args) {
        CustomArrayListApplication customArrayListApplication = new CustomArrayListApplication();
        customArrayListApplication.teamsArray();
        System.out.println("-----------------------");


    }

    private void teamsArray() {

        CustomList<String> teamNames = new CustomArrayList<>();

        String[] hockeyTeamsArray = {"Edmonton Oilers", "Vancouver Canucks", "Calgary Flames", "San Jose Sharks", "Detroit RedWings", "Colorado Avalanche"
                , "Toronto Maple Leafs", "Las Vegas Golden Knights", "LA Kings", "Dallas Stars", "Chicago BlackHawks", "Anaheim Ducks", "Florida Panthers",
                "Montreal Canadians", "Nashville Predators", "New York Rangers", "New York Islanders", "Florida Panthers"};


        teamNames.add("---Added --- Seattle Kraken ---Added--");


        for (int i = 0; i < hockeyTeamsArray.length; i++) {


            teamNames.add(hockeyTeamsArray[i]);


        }
        for (int j = 0; j < teamNames.getSize(); j++) {
            System.out.println(teamNames.get(j));

        }
        System.out.println("Total number of items " + teamNames.getSize());
//        Stream.of(hockeyTeamsArray).forEach(System.out::println);
    }


}
