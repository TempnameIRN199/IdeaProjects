package utils;

public final class Player
{
	private int id;
	private String name;
	private byte position;
	private Team team;
	
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public byte getPosition()
	{
		return position;
	}

	public void setPosition(byte position)
	{
		this.position = position;
	}

	public Team getTeam()
	{
		return team;
	}

	public void setTeam(Team team)
	{
		this.team = team;
	}

	public Player(int id, String name, byte position, Team team)
	{
		this.id = id;
		this.name = name;
		this.position = position;
		this.team = team;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Player [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", position=");
		builder.append(position);
		builder.append(", team=");
		builder.append(team);
		builder.append("]");
		return builder.toString();
	}
}
