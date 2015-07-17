
package controller;

import dao.company.CompanyDao;
import entity.Company;
import java.util.Date;
import javax.enterprise.inject.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author d.kiryanov
 */
@Controller
public class CompanyController {

    @Autowired
    private CompanyDao companyDao;
    
    @RequestMapping("Company/Add")
    public String addCompany(Model model)
    {
        Company company = new Company();
        company.setDateOfEstablishment(new Date());
        company.setDescription("Some company's description");
        company.setEmail("itransition@mail.ru");
        company.setEmployeesQty(100);
        company.setName("Itransition");
        company.setPhone("+375257307853");
        company.setWebSite("http://itransition.com");    
        
        
        companyDao.addEntity(company);
        
        return "index";
    }
}
