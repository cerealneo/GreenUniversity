package kr.co.greenuniversity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentDTO {

    private int no;
    private String college_name;
    private String department_name;
    private String department_eng_name;
    private String establishment_date;
    private String pro_name;
    private String dep_number;

}
