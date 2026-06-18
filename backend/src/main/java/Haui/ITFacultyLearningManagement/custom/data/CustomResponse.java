package Haui.ITFacultyLearningManagement.custom.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomResponse<T> {
    private int status;
    private T data;
    private String message;


    public CustomResponse(T i, T o, T s) {
    }
}
