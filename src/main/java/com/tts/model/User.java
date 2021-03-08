package com.tts.model;

//Auto-generated id
//Strings for username and password (they can't be null)
//A Map that uses Product and Integer pairs called "cart".
//Use the `@ElementCollection` tag: It basically makes the map into a table with a Foreign Key to a Product and the quantity as a number without making a new model. (very similar to @OneToMany)


public class User {
	
	
	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.user;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}


}
