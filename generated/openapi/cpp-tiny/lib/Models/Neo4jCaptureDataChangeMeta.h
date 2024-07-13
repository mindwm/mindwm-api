
/*
 * Neo4jCaptureDataChange_meta.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Neo4jCaptureDataChange_meta_H_
#define TINY_CPP_CLIENT_Neo4jCaptureDataChange_meta_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Neo4jCaptureDataChange_meta_source.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Neo4jCaptureDataChange_meta{
public:

    /*! \brief Constructor.
	 */
    Neo4jCaptureDataChange_meta();
    Neo4jCaptureDataChange_meta(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Neo4jCaptureDataChange_meta();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChange_meta_source getSource();

	/*! \brief Set 
	 */
	void setSource(Neo4jCaptureDataChange_meta_source  source);
	/*! \brief Get 
	 */
	int getTimestamp();

	/*! \brief Set 
	 */
	void setTimestamp(int  timestamp);
	/*! \brief Get 
	 */
	int getTxEventId();

	/*! \brief Set 
	 */
	void setTxEventId(int  txEventId);
	/*! \brief Get 
	 */
	int getTxEventsCount();

	/*! \brief Set 
	 */
	void setTxEventsCount(int  txEventsCount);
	/*! \brief Get 
	 */
	int getTxId();

	/*! \brief Set 
	 */
	void setTxId(int  txId);
	/*! \brief Get 
	 */
	std::string getUsername();

	/*! \brief Set 
	 */
	void setUsername(std::string  username);


    private:
    std::string operation{};
    Neo4jCaptureDataChange_meta_source source;
    int timestamp{};
    int txEventId{};
    int txEventsCount{};
    int txId{};
    std::string username{};
};
}

#endif /* TINY_CPP_CLIENT_Neo4jCaptureDataChange_meta_H_ */
