
/*
 * Neo4jCaptureDataChange_payload.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Neo4jCaptureDataChange_payload_H_
#define TINY_CPP_CLIENT_Neo4jCaptureDataChange_payload_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Neo4jCaptureDataChangeNodePayload.h"
#include "Neo4jCaptureDataChangeRelationshipPayload.h"
#include "Neo4jCaptureDataChangeRelationshipPayload_end.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Neo4jCaptureDataChange_payload{
public:

    /*! \brief Constructor.
	 */
    Neo4jCaptureDataChange_payload();
    Neo4jCaptureDataChange_payload(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Neo4jCaptureDataChange_payload();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Object getAfter();

	/*! \brief Set 
	 */
	void setAfter(Object  after);
	/*! \brief Get 
	 */
	std::string getBefore();

	/*! \brief Set 
	 */
	void setBefore(std::string  before);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChangeRelationshipPayload_end getEnd();

	/*! \brief Set 
	 */
	void setEnd(Neo4jCaptureDataChangeRelationshipPayload_end  end);
	/*! \brief Get 
	 */
	std::string getLabel();

	/*! \brief Set 
	 */
	void setLabel(std::string  label);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChangeRelationshipPayload_end getStart();

	/*! \brief Set 
	 */
	void setStart(Neo4jCaptureDataChangeRelationshipPayload_end  start);


    private:
    Object after;
    std::string before{};
    std::string id{};
    std::string type{};
    Neo4jCaptureDataChangeRelationshipPayload_end end;
    std::string label{};
    Neo4jCaptureDataChangeRelationshipPayload_end start;
};
}

#endif /* TINY_CPP_CLIENT_Neo4jCaptureDataChange_payload_H_ */
