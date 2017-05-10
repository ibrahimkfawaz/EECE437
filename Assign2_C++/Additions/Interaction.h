#include <vector>

struct Interaction : public TAPart
{
	vector<Component*> components;
	vector<Port*> ports;
	TATerm & guard;
	TAStmt & action;

	void addComponentPort(Component & c,Port & p)
	{
		Component * c1 = new Component();
		c1.clone(c);
		Port *p1 = new Port();
		p1.setName(p.getName());
		p1.state=p.state;
		components.push_back(c1);
		ports.push_back(p1);
	}

	void addGuard(TATerm & g) : guard(g) 
	{

	}

	void addAction(TAStmt * a) : action(a)
	{

	}

	bool isReady()
	{	
		bool res = true;
		vector<Port*>::iterator it;
		int i=0;
		for(it=ports.begin();it<ports.end();it++,i++)
		{
			if(!ports[i]->getState())
			{
				return false
			}
		}
		return res;
	}

	void execute()
	{
		action.execute();
	}
};