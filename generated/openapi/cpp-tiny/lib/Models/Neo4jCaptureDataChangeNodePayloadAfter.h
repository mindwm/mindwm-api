
/*
 * Neo4jCaptureDataChangeNodePayload_after.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Neo4jCaptureDataChangeNodePayload_after_H_
#define TINY_CPP_CLIENT_Neo4jCaptureDataChangeNodePayload_after_H_


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

class Neo4jCaptureDataChangeNodePayload_after{
public:

    /*! \brief Constructor.
	 */
    Neo4jCaptureDataChangeNodePayload_after();
    Neo4jCaptureDataChangeNodePayload_after(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Neo4jCaptureDataChangeNodePayload_after();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getLabels();

	/*! \brief Set 
	 */
	void setLabels(std::list <std::string> labels);
	/*! \brief Get 
	 */
	Map<std::string, std::string> getProperties();

	/*! \brief Set 
	 */
	void setProperties(Map <std::string, std::string> properties);


    private:
    std::list<std::string> labels;
    Map<std::string, std::string> properties;
};
}

#endif /* TINY_CPP_CLIENT_Neo4jCaptureDataChangeNodePayload_after_H_ */
