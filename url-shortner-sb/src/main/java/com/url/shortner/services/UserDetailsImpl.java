package com.url.shortner.services;

import com.url.shortner.models.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Data
@NoArgsConstructor
public class UserDetailsImpl implements UserDetails
{
    private static final long serialVersionUID = 1L;
    private long id;
    private String username;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl(long id, String username, String email, String password, Collection<? extends GrantedAuthority> authorities)
    {
        this.authorities = authorities;
        this.email = email;
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public static UserDetailsImpl build(User user)
    {
        GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());

        return new UserDetailsImpl(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                Collections.singletonList(authority)
        );
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
