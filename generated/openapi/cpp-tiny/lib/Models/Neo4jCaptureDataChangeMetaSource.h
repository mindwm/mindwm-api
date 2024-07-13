
/*
 * Neo4jCaptureDataChange_meta_source.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Neo4jCaptureDataChange_meta_source_H_
#define TINY_CPP_CLIENT_Neo4jCaptureDataChange_meta_source_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Neo4jCaptureDataChange_meta_source{
public:

    /*! \brief Constructor.
	 */
    Neo4jCaptureDataChange_meta_source();
    Neo4jCaptureDataChange_meta_source(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Neo4jCaptureDataChange_meta_source();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getHostname();

	/*! \brief Set 
	 */
	void setHostname(std::string  hostname);


    private:
    std::string hostname{};
};
}

#endif /* TINY_CPP_CLIENT_Neo4jCaptureDataChange_meta_source_H_ */
