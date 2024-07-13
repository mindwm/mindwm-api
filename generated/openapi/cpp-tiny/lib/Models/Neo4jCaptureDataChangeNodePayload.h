
/*
 * Neo4jCaptureDataChangeNodePayload.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Neo4jCaptureDataChangeNodePayload_H_
#define TINY_CPP_CLIENT_Neo4jCaptureDataChangeNodePayload_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Neo4jCaptureDataChangeNodePayload_after.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Neo4jCaptureDataChangeNodePayload{
public:

    /*! \brief Constructor.
	 */
    Neo4jCaptureDataChangeNodePayload();
    Neo4jCaptureDataChangeNodePayload(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Neo4jCaptureDataChangeNodePayload();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Neo4jCaptureDataChangeNodePayload_after getAfter();

	/*! \brief Set 
	 */
	void setAfter(Neo4jCaptureDataChangeNodePayload_after  after);
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


    private:
    Neo4jCaptureDataChangeNodePayload_after after;
    std::string before{};
    std::string id{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_Neo4jCaptureDataChangeNodePayload_H_ */
