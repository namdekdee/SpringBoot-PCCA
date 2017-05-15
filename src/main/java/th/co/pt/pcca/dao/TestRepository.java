package th.co.pt.pcca.dao;

import org.springframework.data.repository.CrudRepository;

import th.co.pt.pcca.model.TestModel;


public interface TestRepository extends CrudRepository<TestModel, Long> {

	List<TestModel> findByUser(Strind user);
}
