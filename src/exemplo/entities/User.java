package exemplo.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class User implements Comparable<User>{
	private String name;
	private LocalDateTime loginTime;
	
	public User(String name, LocalDateTime loginTime) {
		this.name = name;
		this.loginTime = loginTime;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getLoginTime() {
		return loginTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLoginTime(LocalDateTime loginTime) {
		this.loginTime = loginTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(User o) {
		return this.name.compareTo(o.getName());
	}

	
}
