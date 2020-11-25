package com.eikholm.jpademo10;

import com.eikholm.jpademo10.model.Owner;
import com.eikholm.jpademo10.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class OwnerController {

    private OwnerService ownerService; // Spring vil selv komme med objektet hertil

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners/","/owners", "owners/index"})
    public String getOwners(Model model){
        System.out.print("Owners, size: ");
        Set<Owner> owners = ownerService.findAll();
        model.addAttribute("owners", owners);
        System.out.println(owners.size());
        return "owners/index";
}
}
