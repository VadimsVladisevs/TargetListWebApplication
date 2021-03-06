package java2.application_target_list.core.responses.board;

import java2.application_target_list.core.domain.Record;
import java2.application_target_list.core.responses.CoreError;

import java.util.List;

public class AddRecordResponse extends RecordCoreResponse{

    private Record newRecord;

    public AddRecordResponse(Record newRecord) {
        this.newRecord = newRecord;
    }

    public AddRecordResponse(List<CoreError> errorList) {
        super(errorList);
    }

    public Record getNewRecord() {
        return newRecord;
    }
}
