package com.example.haribaskarcw1.Haribaskar_service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw1.Haribaskar_model.HaribaskarPayroll;
import com.example.haribaskarcw1.Haribaskar_repository.HaribaskarPayrollRepo;

@Service
public class HaribaskarPayrollService {
    @Autowired
    HaribaskarPayrollRepo payrollRepo;

    public HaribaskarPayroll addPayroll(Long id, HaribaskarPayroll payroll) {
        HaribaskarPayroll avail = payrollRepo.findById(id).orElse(null);

        if (avail != null) {
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
            return payrollRepo.save(avail);
        } else
            return null;
    }

    public Optional<HaribaskarPayroll> getPayroll(Long employeeId) {
        return payrollRepo.findById(employeeId);
    }
}
