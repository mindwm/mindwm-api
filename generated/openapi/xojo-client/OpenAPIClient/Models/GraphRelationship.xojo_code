#tag Class
Protected Class GraphRelationship

	#tag Property, Flags = &h0
		#tag Note
			Identifies the event.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		source As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The version of the CloudEvents specification which the event uses.
		#tag EndNote
		specversion As String
	#tag EndProperty


	#tag Property, Flags = &h0
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content type of the data value. Must adhere to RFC 2046 format.
		#tag EndNote
		datacontenttype As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Identifies the schema that data adheres to.
		#tag EndNote
		dataschema As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Describes the subject of the event in the context of the event producer (identified by source).
		#tag EndNote
		subject As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Timestamp of when the occurrence happened. Must adhere to RFC 3339.
		#tag EndNote
		time As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		data As OpenAPIClient.Models.GraphRelationshipAllOfData
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Base64 encoded event payload. Must adhere to RFC4648.
		#tag EndNote
		data_base64 As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = SourceEnum, Type = Integer, Flags = &h0
        
        GraphPeriodRelationship
        
    #tag EndEnum

    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Created
        Updated
        Deleted
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function SourceEnumToString(value As SourceEnum) As String
		  Select Case value
		    
		    Case SourceEnum.GraphPeriodRelationship
		      Return "graph.relationship"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Created
		      Return "created"
		    Case TypeEnum.Updated
		      Return "updated"
		    Case TypeEnum.Deleted
		      Return "deleted"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="specversion"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="datacontenttype"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dataschema"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="subject"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GraphRelationshipAllOfData"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="data_base64"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


