package bo;

import dao.CustomerDAO;
import dao.CustomerDAOimp;
import model.Customer;

import java.util.List;

public class CustomerBOimp implements CustomerBO{
    private CustomerDAO customerDAO=new CustomerDAOimp();
    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public void create(Customer customer) {
        customerDAO.create(customer);
    }
    @Override
    public void update(Customer customer){
        customerDAO.update(customer);
    }

    @Override
    public void delete(int id) {
        customerDAO.delete(id);
    }
}
