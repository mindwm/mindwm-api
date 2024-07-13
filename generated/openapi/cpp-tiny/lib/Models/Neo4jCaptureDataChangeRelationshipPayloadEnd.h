
/*
 * Neo4jCaptureDataChangeRelationshipPayload_end.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Neo4jCaptureDataChangeRelationshipPayload_end_H_
#define TINY_CPP_CLIENT_Neo4jCaptureDataChangeRelationshipPayload_end_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Neo4jCaptureDataChangeRelationshipPayload_end{
public:

    /*! \brief Constructor.
	 */
    Neo4jCaptureDataChangeRelationshipPayload_end();
    Neo4jCaptureDataChangeRelationshipPayload_end(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Neo4jCaptureDataChangeRelationshipPayload_end();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getIds();

	/*! \brief Set 
	 */
	void setIds(Map <std::string, std::string> ids);
	/*! \brief Get 
	 */
	std::list<std::string> getLabels();

	/*! \brief Set 
	 */
	void setLabels(std::list <std::string> labels);


    private:
    std::string id{};
    Map<std::string, std::string> ids;
    std::list<std::string> labels;
};
}

#endif /* TINY_CPP_CLIENT_Neo4jCaptureDataChangeRelationshipPayload_end_H_ */
