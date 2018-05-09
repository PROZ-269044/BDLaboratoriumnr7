package model;

public class CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id = 7369;
		CRUDWorker CRUDWorker = new CRUDWorker();
		Worker worker = new Worker();
		
		CRUDWorker.createWorker(worker);
		CRUDWorker.readWorker(id);
		CRUDWorker.updateWorker(id);
		CRUDWorker.deleteWorker(id);
		
	}

}
