
/*
 * GraphNode.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GraphNode_H_
#define TINY_CPP_CLIENT_GraphNode_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "GraphNode_allOf_data.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GraphNode{
public:

    /*! \brief Constructor.
	 */
    GraphNode();
    GraphNode(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GraphNode();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Identifies the event.
	 */
	std::string getId();

	/*! \brief Set Identifies the event.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getSource();

	/*! \brief Set 
	 */
	void setSource(std::string  source);
	/*! \brief Get The version of the CloudEvents specification which the event uses.
	 */
	std::string getSpecversion();

	/*! \brief Set The version of the CloudEvents specification which the event uses.
	 */
	void setSpecversion(std::string  specversion);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);
	/*! \brief Get Content type of the data value. Must adhere to RFC 2046 format.
	 */
	std::string getDatacontenttype();

	/*! \brief Set Content type of the data value. Must adhere to RFC 2046 format.
	 */
	void setDatacontenttype(std::string  datacontenttype);
	/*! \brief Get Identifies the schema that data adheres to.
	 */
	std::string getDataschema();

	/*! \brief Set Identifies the schema that data adheres to.
	 */
	void setDataschema(std::string  dataschema);
	/*! \brief Get Describes the subject of the event in the context of the event producer (identified by source).
	 */
	std::string getSubject();

	/*! \brief Set Describes the subject of the event in the context of the event producer (identified by source).
	 */
	void setSubject(std::string  subject);
	/*! \brief Get Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	 */
	std::string getTime();

	/*! \brief Set Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	 */
	void setTime(std::string  time);
	/*! \brief Get 
	 */
	GraphNode_allOf_data getData();

	/*! \brief Set 
	 */
	void setData(GraphNode_allOf_data  data);
	/*! \brief Get Base64 encoded event payload. Must adhere to RFC4648.
	 */
	std::string getDataBase64();

	/*! \brief Set Base64 encoded event payload. Must adhere to RFC4648.
	 */
	void setDataBase64(std::string  data_base64);


    private:
    std::string id{};
    std::string source{};
    std::string specversion{};
    std::string type{};
    std::string datacontenttype{};
    std::string dataschema{};
    std::string subject{};
    std::string time{};
    GraphNode_allOf_data data;
    std::string data_base64{};
};
}

#endif /* TINY_CPP_CLIENT_GraphNode_H_ */
