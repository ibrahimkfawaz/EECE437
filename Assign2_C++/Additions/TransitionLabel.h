
struct TransitionLabel : public TAPart
{
	Port & port;
	TAStmt & action;
	TATerm & guard;

	TransitionLabel(Port & p,TAStmt & a,TATerm & g) : 
	port(p),action(a),guard(g)
	{
	}

	
};