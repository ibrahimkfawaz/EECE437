struct TAPart
{
	int id;
	string name;
	TAPart(string n) : id(current_id++)
	{
		name=n;
	}
	void setName(string n)
	{
		name = s;
	}
	string getName()
	{
		return name;
	}

	static int current_id;

	int getId()
	{
		return id;
	}
};
