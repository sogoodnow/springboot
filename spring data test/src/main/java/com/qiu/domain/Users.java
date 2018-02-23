// Generated with g9.

package com.qiu.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import org.springframework.stereotype.Component;

//@NamedQuery(name = "Users.user_search", query = "select user from Users user where user.name=?1")
@Component
@Entity(name="users")
public class Users implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 530658579036387848L;

	/** Primary key. */
    protected static final String PK = "idusers";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int idusers;
    @Column(name="login_name", length=45)
    private String loginName;
    @Column(name="login_pswd", length=45)
    private String loginPswd;
    @Column(name="last_login_time")
    private Timestamp lastLoginTime;
    @Column(name="last_ip", length=45)
    private String lastIp;


    /** Default constructor. */
    public Users() {
        super();
    }

    /**
     * Access method for idusers.
     *
     * @return the current value of idusers
     */
    public int getIdusers() {
        return idusers;
    }

    /**
     * Setter method for idusers.
     *
     * @param aIdusers the new value for idusers
     */
    public void setIdusers(int aIdusers) {
        idusers = aIdusers;
    }

    /**
     * Access method for loginName.
     *
     * @return the current value of loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Setter method for loginName.
     *
     * @param aLoginName the new value for loginName
     */
    public void setLoginName(String aLoginName) {
        loginName = aLoginName;
    }

    /**
     * Access method for loginPswd.
     *
     * @return the current value of loginPswd
     */
    public String getLoginPswd() {
        return loginPswd;
    }

    /**
     * Setter method for loginPswd.
     *
     * @param aLoginPswd the new value for loginPswd
     */
    public void setLoginPswd(String aLoginPswd) {
        loginPswd = aLoginPswd;
    }

    /**
     * Access method for lastLoginTime.
     *
     * @return the current value of lastLoginTime
     */
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Setter method for lastLoginTime.
     *
     * @param aLastLoginTime the new value for lastLoginTime
     */
    public void setLastLoginTime(Timestamp aLastLoginTime) {
        lastLoginTime = aLastLoginTime;
    }

    /**
     * Access method for lastIp.
     *
     * @return the current value of lastIp
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * Setter method for lastIp.
     *
     * @param aLastIp the new value for lastIp
     */
    public void setLastIp(String aLastIp) {
        lastIp = aLastIp;
    }


    /**
     * Compares the key for this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Users and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Users)) {
            return false;
        }
        Users that = (Users) other;
        if (this.getIdusers() != that.getIdusers()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Users)) return false;
        return this.equalKeys(other) && ((Users)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdusers();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Users |");
        sb.append(" idusers=").append(getIdusers());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idusers", new Integer(getIdusers()));
        return ret;
    }

}
