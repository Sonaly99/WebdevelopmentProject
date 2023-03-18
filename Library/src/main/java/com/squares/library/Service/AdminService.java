package com.squares.library.Service;

import com.squares.library.dto.AdminDto;
import com.squares.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);
    Admin save(AdminDto adminDto);
}
