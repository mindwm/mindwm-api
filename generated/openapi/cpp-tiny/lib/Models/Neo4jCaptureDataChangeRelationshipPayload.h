
/*
 * Neo4jCaptureDataChangeRelationshipPayload.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Neo4jCaptureDataChangeRelationshipPayload_H_
#define TINY_CPP_CLIENT_Neo4jCaptureDataChangeRelationshipPayload_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Neo4jCaptureDataChangeRelationshipPayload_end.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Neo4jCaptureDataChangeRelationshipPayload{
public:

    /*! \brief Constructor.
	 */
    Neo4jCaptureDataChangeRelationshipPayload();
    Neo4jCaptureDataChangeRelationshipPayload(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Neo4jCaptureDataChangeRelationshipPayload();


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
	Neo4jCaptureDataChangeRelationshipPayload_end getEnd();

	/*! \brief Set 
	 */
	void setEnd(Neo4jCaptureDataChangeRelationshipPayload_end  end);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
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
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);


    private:
    Object after;
    std::string before{};
    Neo4jCaptureDataChangeRelationshipPayload_end end;
    std::string id{};
    std::string label{};
    Neo4jCaptureDataChangeRelationshipPayload_end start;
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_Neo4jCaptureDataChangeRelationshipPayload_H_ */
