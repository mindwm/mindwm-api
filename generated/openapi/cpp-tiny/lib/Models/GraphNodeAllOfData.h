
/*
 * GraphNode_allOf_data.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GraphNode_allOf_data_H_
#define TINY_CPP_CLIENT_GraphNode_allOf_data_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Neo4jCaptureDataChangeNodePayload.h"
#include "Neo4jCaptureDataChange_meta.h"
#include "Neo4jCaptureDataChange_schema.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GraphNode_allOf_data{
public:

    /*! \brief Constructor.
	 */
    GraphNode_allOf_data();
    GraphNode_allOf_data(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GraphNode_allOf_data();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Object getHeaders();

	/*! \brief Set 
	 */
	void setHeaders(Object  headers);
	/*! \brief Get 
	 */
	std::string getMessageKey();

	/*! \brief Set 
	 */
	void setMessageKey(std::string  message_key);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChange_meta getMeta();

	/*! \brief Set 
	 */
	void setMeta(Neo4jCaptureDataChange_meta  meta);
	/*! \brief Get 
	 */
	int getOffset();

	/*! \brief Set 
	 */
	void setOffset(int  offset);
	/*! \brief Get 
	 */
	int getPartition();

	/*! \brief Set 
	 */
	void setPartition(int  partition);
	/*! \brief Get 
	 */
	std::string getSourceType();

	/*! \brief Set 
	 */
	void setSourceType(std::string  source_type);
	/*! \brief Get 
	 */
	std::string getTimestamp();

	/*! \brief Set 
	 */
	void setTimestamp(std::string  timestamp);
	/*! \brief Get 
	 */
	std::string getTopic();

	/*! \brief Set 
	 */
	void setTopic(std::string  topic);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChange_schema getSchema();

	/*! \brief Set 
	 */
	void setSchema(Neo4jCaptureDataChange_schema  schema);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChangeNodePayload getPayload();

	/*! \brief Set 
	 */
	void setPayload(Neo4jCaptureDataChangeNodePayload  payload);


    private:
    Object headers;
    std::string message_key{};
    Neo4jCaptureDataChange_meta meta;
    int offset{};
    int partition{};
    std::string source_type{};
    std::string timestamp{};
    std::string topic{};
    Neo4jCaptureDataChange_schema schema;
    Neo4jCaptureDataChangeNodePayload payload;
};
}

#endif /* TINY_CPP_CLIENT_GraphNode_allOf_data_H_ */
