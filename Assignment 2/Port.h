

struct Port : public TAPart
{
	bool state;
	void makeReady()
	{
		state=true;
	}
	void makeUnavailable()
	{
		state=false;
	}
	bool getState()
	{
		return state;
	}
};