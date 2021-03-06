package software_masters.business_planner;

import java.util.ArrayList;

public class Department
{
	private Template model;
	private ArrayList<Template> oldTemplates;
	
	public Department(Template model)
	{
		this.model=model;
		oldTemplates=new ArrayList<Template>();
	}
	public Template getModel()
	{
		return model;
	}
	
	public ArrayList<Template> getOldTemplates()
	{
		return oldTemplates;
	}
	
	public void addNewTemplate(Template temp)
	{
		oldTemplates.add(temp);
	}
}
