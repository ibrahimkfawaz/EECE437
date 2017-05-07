
struct TAThereExists : public TATerm
{
	TATerm & formula;
	TAType & domain;

	TAForAll(TATerm &f, TAType &d) : 
		formula(f), domain(d)
	{
	}

	virtual TAValue & evaluate()
	{

	}

	virtual void list(ostream & os)
	{

	}
};
