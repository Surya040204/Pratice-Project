package Scholar.dao;

import Scholar.model.Scholar;

public interface ScholarDaoInterface {
	// specifies the behavior of a class by providing an abstract type
	/* Interfaces are used in Java to achieve abstraction. (A process of hiding the
	implementation details and showing only functionality to the user)*/
    public boolean insertScholar(Scholar s);
    public boolean delete(int id);
    public boolean update(int id,String update,int ch,Scholar s);
    public void showAllScholar();
    public boolean showScholarById(int id);
}