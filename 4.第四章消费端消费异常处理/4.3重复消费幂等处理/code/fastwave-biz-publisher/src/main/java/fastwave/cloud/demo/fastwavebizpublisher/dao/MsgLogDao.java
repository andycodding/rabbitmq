package fastwave.cloud.demo.fastwavebizpublisher.dao;

import fastwave.cloud.demo.fastwavebizpublisher.domain.MsgLogDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MsgLogDao {

    int save(MsgLogDO msgLogDO);

    int update(MsgLogDO msgLogDO);

    int increaseTryTimes();

    List<MsgLogDO> list(Map<String, Object> map);
}
