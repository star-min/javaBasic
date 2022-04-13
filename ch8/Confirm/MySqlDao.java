package Confirm;

public class MySqlDao  implements DataAccessObject {
	//CRUD
		@Override
		public void select() {
			System.out.println("MySQL DB 검색");
		}

		@Override
		public void insert() {
			System.out.println("MySQL DB 삽입");
		}

		@Override
		public void update() {
			System.out.println("MySQL DB 수정");
		}

		@Override
		public void delete() {
			System.out.println("MySQL DB 삭제");
		}
		
	}
