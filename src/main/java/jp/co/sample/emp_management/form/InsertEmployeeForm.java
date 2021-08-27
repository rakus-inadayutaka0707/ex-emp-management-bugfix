package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 従業員登録フォーム.
 * 
 * @author inada
 *
 */
public class InsertEmployeeForm {
	/** 名前 */
	@NotBlank(message = "名前を入力してください")
	private String name;
	/** 写真 */
	@NotEmpty(message = "写真を選択してください")
	private String image;
	/** 性別 */
	@NotEmpty(message = "性別を選択してください")
	private String gender;
	/** 入社日 */
	@NotBlank(message = "入社日を選択してください")
	private String hireDate;
	/** メールアドレス */
	@Size(min = 1, max = 127, message = "1文字から127文字以内で入力してください")
	@Email(message = "Eメール形式で入力してください")
	private String mailAddress;
	/** 郵便番号 */
	@Pattern(regexp = "^[0-9]{7}$",message="郵便番号をハイフンなしで入力してください")
	private String zipCode;
	/** 住所 */
//	@NotBlank(message = "住所を入力してください")
	private String address;
	/** 電話番号 */
	@Pattern(regexp = "^[0-9]{11}$",message="電話番号をハイフンなしで入力してください")
	private String telephone;
	/** 給料 */
	@NotBlank(message = "給料を入力してください")
	private String salary;
	/** 特性 */
	@Size(min = 1, max = 2000, message = "1文字から2000文字以内で入力してください")
	private String characteristics;
	/** 扶養家族 */
	@NotBlank(message = "扶養家族を入力してください")
	private String dependentsCount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public String getDependentsCount() {
		return dependentsCount;
	}

	public void setDependentsCount(String dependentsCount) {
		this.dependentsCount = dependentsCount;
	}

	@Override
	public String toString() {
		return "InsertEmployeeForm [name=" + name + ", image=" + image + ", gender=" + gender + ", hireDate=" + hireDate
				+ ", mailAddress=" + mailAddress + ", zipCode=" + zipCode + ", address=" + address + ", telephone="
				+ telephone + ", salary=" + salary + ", characteristics=" + characteristics + ", dependentsCount="
				+ dependentsCount + "]";
	}
}
