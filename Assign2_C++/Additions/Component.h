#include <string>
#include <vector>
#include <unordered_map>
#include <cstdlib>
using namespace std;


struct Component : public TAPart
{
	vector<State*> states;
	int initialState; //position in vector
	int currentState;
	vector<Port*> ports;
	vector<Transition*> transitions;
	vector<TransitionLabel*> tLabels;
	unordered_map<string,string> tLabelMap; //mapping labels and transitions

	void clone(Component & c)
	{
		setName(c.getName());
		states = c.states;
		initialState = c.initialState;
		currentState = c.currentState;
		ports = c.ports;
		transitions = c.transitions;
		tLabels = c.tLabels;
		tLabelMap = c.tLabelMap;
	}

	void addState(string n)
	{
		State * s = new State(n);
		states.push_back(s);
	} 
	void addPort(string n)
	{
		Port * p = new Port(n);
		ports.push_back(p); 
	}
	//pass the name of the state
	void setInitState(string n)
	{
		vector<State*>::iterator it;
		int i=0;
		for(it=states.begin();it<states.end();it++,i++)
		{
			if(states[i]->getName()==n)
			{
				initialState=i;
			}
		}
		currentState = initialState;
	}
	void addTransition(string n)
	{
		Transition * t = new Transition(n);
		transitions.push_back(t); 
	}
	void addTLabel(Port & p,TAStmt & a, TATerm & g)
	{
		TransitionLabel * t = new TransitionLabel(p,a,g);
		tLabels.push_back(t);
	}
	void mapTLabel(string lName,string tName)
	{
		tLabelMap.insert({lName,tName});
	}

	void printVariables()
	{
		vector<TransitionLabel*>::iterator it;
		int i=0;
		cout << "Guards Used:"<<endl;
		for(it=tLabels.begin();it<tLabels.end();it++,i++)
		{
			tLabels[i].guard.list(cout);
			cout<<endl;
		}

		i=0;
		cout << "Actions Used:"<<endl;
		for(it=tLabels.begin();it<tLabels.end();it++,i++)
		{
			cout << tLabels[i].action.getName() << endl;
		}
	}

	void printState()
	{
		cout << "Current State of Component " << name << " : " << states[currentState]->getName() <<endl;
	}

	bool isPortReady(string name)
	{
		vector<Port*>::iterator it;
		int i=0;
		for(it=ports.begin();it<ports.end();it++,i++)
		{
			if(ports[i]->getName()==name)
			{
				return ports[i]->getState();
			}
		}
	}

	Transition & getCurrentTransition(string portName)
	{
		int numT = 0;//number of transitions available 
		int i=0;
		int j=0;
		vector<int> tr;
		string tName;
		vector<Transition*>::iterator iter;
		vector<TransitionLabel*>::iterator it;
		for(it=tLabels.begin();it<tLabels.end();it++,i++)
		{
			//find the transition associated with this label
			unordered_map<string,string>::const_iterator got = tLabels.find(tLabels[i]->getName());
			string tName = got->second;
			if(tLabels[i]->port.getName()==portName && tLabels[i]->guard.getValue().getBool()==true)
			{	
				j=0;
				//if this transition has a beginning state = current state, add it
				for(iter=transitions.begin();iter<transitions.end();iter++,j++)
				{
					if(transitions[j]->getName()==tName)
					{
						if(transitions[j]->start==states[currentState]->getName())
						{
							tr.push_back(j);
							numT++;
						}
					}
				}		

			
			}
		}

		int r = (rand()%numT);
		return transitions[r];

	}

	void evaluate()
	{
		//compute which transitions are eligible from current state
		string currS = states[currentState]->getName();
		vector<int> tr;
		int numT=0;
		vector<Transition*>::iterator iter;
		int i=0;
		for(iter=transitions.begin();iter<transitions.end();iter++,i++)
		{
			if(transitions[i]->start==currS)
			{
				numT++;
				tr.push_back(i);
			}
		}

		int r = (rand()%numT);
		string newState = transitions[r]->end;
		vector<State*>::iterator it;
		int j=0;
		for(it=states.begin();it<states.end();it++,j++)
		{
			if(states[j]->getName()==end)
			{
				currentState=j;
			}
		}

	}
};