package org.hswebframework.web.workflow.dimension;


import lombok.*;
import org.activiti.engine.task.TaskInfo;

/**
 * @author zhouhao
 * @since 3.0.0-RC
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DimensionContext {

    /**
     * 流程发起人ID
     */
    private String creatorId;

    /**
     * 当前环节
     */
    private TaskInfo currentTask;

    /**
     * 上一环节
     */
    private TaskInfo preTask;
}
