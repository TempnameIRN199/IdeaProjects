import utils.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args)
	{
        Team team1 = new Team(1, "Team A", "City A");
        Team team2 = new Team(2, "Team B", "City B");

        Player player1 = new Player(1, "Player 1", (byte) 1, team1);
        Player player2 = new Player(2, "Player 2", (byte) 2, team1);
        Player player3 = new Player(3, "Player 3", (byte) 3, team2);
        Player player4 = new Player(4, "Player 4", (byte) 4, team1);

        Match match1 = new Match(1, new Date(), team1, team2, new Player[]{player1, player2});
        Match match2 = new Match(2, new Date(), team1, team2, new Player[]{player1, player2, player3});
        Match match3 = new Match(3, new Date(), team1, team2, new Player[]{player1, player3});
        Match match4 = new Match(4, new Date(), team1, team2, new Player[]{player1, player4});

        List<Match> matches = Arrays.asList(match1, match2, match3, match4);

        Map<String, List<String>> result = matches.stream()
                .flatMap(match -> Arrays.stream(match.getPlayers()))
                .collect(Collectors.groupingBy(
                        player -> player.getTeam().getName() + "-" + player.getName(),
                        Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 3)
                .collect(Collectors.groupingBy(
                        entry -> entry.getKey().split("-")[0],
                        Collectors.mapping(
                                entry -> entry.getKey().split("-")[1],
                                Collectors.toList())));
        
        result.forEach((team, players) ->
        {
        	System.out.println("-------");
        	System.out.println(team);
        	
        	players.forEach((val) -> System.out.println(val));
        	
        	System.out.println("-------");
        });
	}
}
