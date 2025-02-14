package utils;

import java.util.Date;

public final class Match
{
	private int id;
	private Date date;
	private Team firstTeam, secondTeam;
	private Player[] players;
	
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public Team getFirstTeam()
	{
		return firstTeam;
	}

	public void setFirstTeam(Team firstTeam)
	{
		this.firstTeam = firstTeam;
	}

	public Team getSecondTeam()
	{
		return secondTeam;
	}

	public void setSecondTeam(Team secondTeam)
	{
		this.secondTeam = secondTeam;
	}

	public Player[] getPlayers()
	{
		return players;
	}

	public void setPlayers(Player[] players)
	{
		this.players = players;
	}

	public Match(int id, Date date, Team firstTeam, Team secondTeam, Player[] players)
	{
		this.id = id;
		this.date = date;
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.players = players;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Match [id=");
		builder.append(id);
		builder.append(", date=");
		builder.append(date);
		builder.append(", firstTeam=");
		builder.append(firstTeam);
		builder.append(", secondTeam=");
		builder.append(secondTeam);
		builder.append(", players=");
		builder.append(players);
		builder.append("]");
		return builder.toString();
	}
}
