
/*
 * Neo4jCaptureDataChange_schema.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Neo4jCaptureDataChange_schema_H_
#define TINY_CPP_CLIENT_Neo4jCaptureDataChange_schema_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Neo4jCaptureDataChange_schema{
public:

    /*! \brief Constructor.
	 */
    Neo4jCaptureDataChange_schema();
    Neo4jCaptureDataChange_schema(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Neo4jCaptureDataChange_schema();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Map<std::string, std::string> getConstraints();

	/*! \brief Set 
	 */
	void setConstraints(Map <std::string, std::string> constraints);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getProperties();

	/*! \brief Set 
	 */
	void setProperties(Map <std::string, std::string> properties);


    private:
    Map<std::string, std::string> constraints;
    Map<std::string, std::string> properties;
};
}

#endif /* TINY_CPP_CLIENT_Neo4jCaptureDataChange_schema_H_ */
