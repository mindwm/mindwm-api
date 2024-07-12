
/*
 * CloudEvent_data.h
 *
 * The event payload.
 */

#ifndef TINY_CPP_CLIENT_CloudEvent_data_H_
#define TINY_CPP_CLIENT_CloudEvent_data_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The event payload.
 *
 *  \ingroup Models
 *
 */

class CloudEvent_data{
public:

    /*! \brief Constructor.
	 */
    CloudEvent_data();
    CloudEvent_data(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CloudEvent_data();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CloudEvent_data_H_ */
