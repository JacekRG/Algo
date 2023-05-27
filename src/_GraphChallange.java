import java.util.*;

public class _GraphChallange {
    static int totalPopulation = 0;
    static Map<Integer, List<Integer>> cityMap = new HashMap<>();

    public static String graphChallenge(String[] strArr) {

        List<Integer> cityKeys = new LinkedList<>();
        Set<Integer> cityValues = new HashSet<>();

        for (String s : strArr) {

            String[] parts = s.split(":");
            cityKeys.add(Integer.parseInt(parts[0]));
            String[] subParts = parts[1]
                    .replaceAll("\\[|\\]", "")
                    .split(",");

            List<Integer> neighbours = new LinkedList<>();
            for (String subPart : subParts) {
                cityValues.add(Integer.parseInt(subPart));
                neighbours.add(Integer.parseInt(subPart));
            }
            cityMap.put(Integer.parseInt(parts[0]), new ArrayList<>(neighbours));
            neighbours.clear();
        }
        Collections.sort(cityKeys);

        for (int value : cityValues) {
            totalPopulation += value;
        }

        StringBuilder finalResult = new StringBuilder();

        for (int i = 0; i < cityKeys.size(); i++) {
            finalResult.append(cityKeys.get(i)).append(":");

            if (cityMap.get(cityKeys.get(i)).size() == 1) {
                finalResult.append(calcTrafficOneNeighbour(cityKeys.get(i)));
            } else finalResult.append(calcNeighboursPopulation(cityKeys.get(i)));
            if (i != cityKeys.size() - 1) {
                finalResult.append(",");
            }
        }
        return finalResult.toString();
    }

    public static int calcTrafficOneNeighbour(int city) {
        return totalPopulation - city;
    }

    public static int calcNeighboursPopulation(int city){
        List<Integer> neighbours = cityMap.get(city);
        List<Integer> multiChoice = new ArrayList<>();
        for(int neighbour : neighbours){
            multiChoice.add(countTraffic(city, neighbour));
        }
        Collections.sort(multiChoice);
        return multiChoice.get(multiChoice.size()-1);
    }

    public static int countTraffic(int motherCity, int city) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> addedValues = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(city);

        int counter = 0;
        while(!stack.isEmpty()) {
            int currentCity = stack.pop();

            if(!visited.contains(currentCity)) {
                visited.add(currentCity);
                if(!addedValues.contains(currentCity)) {
                    addedValues.add(currentCity);
                    counter += currentCity;
                }

                List<Integer> neighbors = cityMap.get(currentCity);
                if(neighbors != null) {
                    for(int neighbor : neighbors) {
                        if(!visited.contains(neighbor) && neighbor != motherCity) {
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String[] testen = {"1:[5]", "2:[5,18]", "3:[5,12]", "4:[5]", "5:[1,2,3,4]", "18:[2]", "12:[3]"};
        System.out.println(graphChallenge(testen));
    }

}
